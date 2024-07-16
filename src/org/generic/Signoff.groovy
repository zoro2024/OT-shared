package org.generic

def call(String user-email, String user-name, String creds, String url, String branch ) {
  stage(configuring git) {
    sh '''
    git config user.email '${user-email}'
    git config user.name '${user-name}'
    git remote set-url origin https://${user-name}:credentialsId: creds@ ${url}
    git add CredScanReport
    git commit --signoff -m "Cred report"
    git push origin ${branch}
    '''
  }
} 
