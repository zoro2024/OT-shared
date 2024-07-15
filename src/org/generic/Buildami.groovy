package org.generic

def call() {
    stage('Build ami') {
      script {
        sh "packer init packer.pkr.hcl"
        sh "packer build packer.pkr.hcl"
      }    
    }
}
