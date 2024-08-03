package org.terraform

def call(String path) {
    sh "cd ${Path} && terraform fmt"
    sh "ls -l"
}
