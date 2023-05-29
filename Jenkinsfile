pipeline {
    agent any
     
    environment {
        registryName = "acrcarrera/digital-nao-a-un-clic-de-un-cambio"
        tenantSecret = credentials('tenant_id')
        appCredential = credentials('af_acr_app')
        registryCredential = 'ACR'
        dockerImage = ''
        registryUrl = 'acrcarrera.azurecr.io'
    }
    
    tools{
        maven 'MAVEN'
    }
    
    stages {
        stage ('checkout') {
            steps {
            	checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], userRemoteConfigs: [[url: 'https://github.com/afcarrera/digital-nao-a-un-clic-de-un-cambio']]])
            }
        }

		stage('Delete AZ group resources') {
			steps{   
				script {
				    sh 'az login --service-principal -u ${appCredential_USR} -p ${appCredential_PSW} --tenant ${tenantSecret}'
				    sh "az group delete --name af_group_jl"
				}
			}
		}
       
        stage ('Build Docker image') {
            steps {
                script {
                    dockerImage = docker.build registryName
                }
            }
        }
       
		stage('Upload Image to ACR') {
			steps{   
				script {
					docker.withRegistry( "http://${registryUrl}", registryCredential ) {
					dockerImage.push()
					}
				}
			}
		}

		stage('Build Maven') {
            steps {
                script {
    				 sh 'mvn clean package'
                }
                script {
                    catchError(buildResult: 'SUCCESS', stageResult: 'UNSTABLE') {
                      	sh 'mvn azure-functions:deploy'
                    }
                }
                script {
    				 sh "az logout"
                }
            }
    	}
    }
 }