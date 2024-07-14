@Library('shared-libot') _

node {
    stage('git checkout') {
        generic.checkout('https://github.com/OT-MICROSERVICES/attendance-api.git', 'main', 'github-token')
    }
    stage('Cred scanning') {
        generic.gitleaks()
        archiveArtifacts artifacts: 'CredScanReport'
    }
    stage('License scanning') {
        generic.trivyinstaller('https://github.com/OT-MICROSERVICES/attendance-api.git')
        archiveArtifacts artifacts: 'trivy-license-report.json'
    }
    stage('Notification') {
        generic.notification()
    }
}
