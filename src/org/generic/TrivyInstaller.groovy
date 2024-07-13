package org.java

def call(String repoUrl) {
    sh """
        trivy ${repoUrl} --format json -o trivy-license-report.json
    """
}
