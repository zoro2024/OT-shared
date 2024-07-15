package org.generic

def call(String url) {
    withCredentials([string(credentialsId: 'github-token1', variable: 'GITHUB_TOKEN')]) {
        sh "trivy repo ${url} --format json -o trivy-license-report.json"
    }
}
