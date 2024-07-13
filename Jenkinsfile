@Library('shared-libot') _

pipeline {
    agent any
    
    stages {
        stage('git checkout') {
            steps {
                script {
                    attendance.checkoutgit('https://github.com/OT-MICROSERVICES/attendance-api.git', 'main', 'github-token')
                }
            }
        }
        stage('Install Gitleaks and run Cred scanning') {
            steps {
                script {
                    attendance.gitleaks()
                }
            }
        }
        stage('Install trivy and run License scanning') {
            steps {
                script {
                    attendance.trivyinstaller('https://github.com/OT-MICROSERVICES/attendance-api.git')
                }
            }
        }
        
    }
}
