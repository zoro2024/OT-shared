package org.generic

def call(String ami_name) {
    sh """
        packer init packer.pkr.hcl
        packer build -var 'ami_name=${ami_name}' packer.pkr.hcl
    """
}
