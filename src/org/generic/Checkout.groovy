package org.generic

def call(String gitUrl, String branch = 'main', String credentialsId) {
    stage('Checkout Git') {
        script {
            git url: gitUrl, branch: branch, credentialsId: credentialsId
            echo "Checked out repository from ${gitUrl} on branch ${branch} using credentials ${credentialsId}"
        }
    }
}