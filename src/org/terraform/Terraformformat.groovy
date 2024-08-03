package org.terraform

def call(String path) {
    sh "terraform fmt"
    sh "ls -l"
}
