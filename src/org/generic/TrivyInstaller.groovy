package org.java

def call(String repoUrl) {
    // Using triple quotes for multi-line shell script
    sh '''
        trivy ${repoUrl} --format json -o trivy-license-report.json
    '''
}
