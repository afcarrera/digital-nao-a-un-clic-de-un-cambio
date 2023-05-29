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

		stage('Deploy template azure function') {
			steps{   
				script {
				    sh 'az login --service-principal -u ${appCredential_USR} -p ${appCredential_PSW} --tenant ${tenantSecret}'
				    sh "az resource delete --resource-group af_group --name afcarrera  --resource-type \"Microsoft.Web/sites\""
				    sh "az resource delete --resource-group af_group --name ASP-afgroup-9672  --resource-type \"Microsoft.Web/serverfarms\""
					sh "az deployment group create --name AFDeployment --resource-group af_group --template-file \"templates/azure-functions/template.json\""
				}
			}
		}

		stage('Build Maven') {
            steps {
                script {
                  	sh 'mvn clean package'
                  	sh 'mvn azure-functions:deploy'
				  	sh "az logout"
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
    }
 }