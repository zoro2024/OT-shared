package org.terraform

def call(String path) {
    sh "cd ${Path} && terraform fmt -check -diff > terraform_fmt_report.txt"
    sh "ls -l"
}
