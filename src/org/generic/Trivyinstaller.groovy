package org.generic

def call(String url) {
    sh "trivy repo ${url} --format json -o trivy-license-report.json"
}
