pipeline {
     agent any
     
        environment {
        //once you create ACR in Azure cloud, use that here
        registryName = "acrcarrera/digital-nao-a-un-clic-de-un-cambio"
        //- update your credentials ID after creating credentials for connecting to ACR
        registryCredential = 'ACR'
        dockerImage = ''
        registryUrl = 'acrcarrera.azurecr.io'
    }
    
    stages {

        stage ('checkout') {
            steps {
            checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [], userRemoteConfigs: [[url: 'https://github.com/afcarrera/digital-nao-a-un-clic-de-un-cambio']]])
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