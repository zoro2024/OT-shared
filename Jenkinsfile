@Library('shared-libot') _

pipeline {
    agent any
    
    stages {
        stage('git checkout') {
            steps {
                script {
                    commongeneric.checkoutgit('https://github.com/OT-MICROSERVICES/attendance-api.git', 'main')
                }
            }
        }
        // stage('Install Gitleaks and run Cred scanning') {
        //     steps {
        //         script {
        //             commongeneric.gitleaks()
        //         }
        //     }
        // }
        // stage('Install trivy and run License scanning') {
        //     steps {
        //         script {
        //             commongeneric.trivyinstaller('https://github.com/OT-MICROSERVICES/attendance-api.git')
        //         }
        //     }
        // }
    }
}
