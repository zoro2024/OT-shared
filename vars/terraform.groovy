import org.terraform.Terraforminit
import org.terraform.Terraformformat

def terraforminit(String path) {
    new Terraforminit().call(path)
}

def terraformformat() {
    new Terraformformat().call()
}
