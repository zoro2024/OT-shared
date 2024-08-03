package org.terraform

def call(String path) {
    sh "cd ${path} && terraform plan"
}
