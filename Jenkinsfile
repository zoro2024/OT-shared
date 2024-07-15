@Library('shared-libot') _   // final Scripted pipeline it use 4 functions from src- checkout, gitleaks, trivy, notification

properties([
    parameters([
        string(name: 'URL', defaultValue: 'https://github.com/OT-MICROSERVICES/attendance-api.git', description: 'Repository URL for checkout')
    ])
])

node {
    // Define parameters
    def url = params.URL ?: 'https://github.com/OT-MICROSERVICES/attendance-api.git'

    try {
        stage('git checkout') {
            generic.checkout(url, 'github-token', 'main')
        }
        stage('Cred scanning') {
            generic.gitleaks()
            archiveArtifacts artifacts: 'CredScanReport'
        }
        stage('License scanning') {
            generic.trivyinstaller(url)
            archiveArtifacts artifacts: 'trivy-license-report.json'
        }
    } catch (Exception e) {
        currentBuild.result = 'FAILURE'
        throw e
    } finally {
        stage('Notification') {
            generic.notification()
        }
    }
}
