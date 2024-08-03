import org.terraform.Terraforminit
import org.terraform.Terraforminit

def terraforminit(String path) {
    new Terraforminit().call(path)
}

def terraformformat(String path) {
    new Terraformformat().call(path)
}
