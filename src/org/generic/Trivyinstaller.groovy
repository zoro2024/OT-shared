package org.java

def call(String repoUrl) {
    sh """
        trivy repo ${repoUrl} --format json -o trivy-license-report.json
    """
}
