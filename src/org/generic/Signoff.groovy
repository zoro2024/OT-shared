package org.generic

class Signoff {
    def call(String useremail, String username, String creds, String url, String branch) {
        stage('configuring git') {
            withCredentials([usernamePassword(credentialsId: creds, passwordVariable: 'PASSWORD', usernameVariable: 'USERNAME')]) {
                sh """
                git config user.email '${useremail}'
                git config user.name '${username}'
                git remote set-url origin https://${username}:${PASSWORD}@${url}
                git add CredScanReport
                git commit --signoff -m "Cred report"
                git push origin ${branch}
                """
            }
        }
    }
}
