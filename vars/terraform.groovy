import org.terraform.Terraforminit
import org.terraform.Terraformformat
import org.terraform.Terraformplan

def terraforminit(String path) {
    new Terraforminit().call(path)
}

def terraformformat() {
    new Terraformformat().call()
}

def terraformplan(String path) {
    new Terraformplan().call(path)
}
