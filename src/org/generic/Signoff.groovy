package org.generic

def call(String useremail, String username, String creds, String url, String branch) {
  stage(configuring git) {
    sh '''
    git config user.email '${useremail}'
    git config user.name '${username}'
    git remote set-url origin https://${username}:credentialsId: creds@ ${url}
    git add CredScanReport
    git commit --signoff -m "Cred report"
    git push origin ${branch}
    '''
  }
} 
