package org.generic

def call() {
    slackSend(
        channel: 'build-status',
        message: "Find Status of Pipeline: ${currentBuild.currentResult} ${env.JOB_NAME} ${env.BUILD_NUMBER} ${BUILD_URL}"
    )
}
