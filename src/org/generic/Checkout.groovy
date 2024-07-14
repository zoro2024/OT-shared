package org.generic

def call(String url, String creds, String branch) {
    stage('Checkout Git') {
        script {
            git url: url, branch: branch, credentialsId: creds
            echo "Checked out repository from ${url} on branch ${branch}"
        }
    }
}
