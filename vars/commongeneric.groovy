import org.generic.Checkout
import org.generic.Gitleaks
import org.generic.Trivyinstaller
import org.generic.Notification

def checkoutgit(String gitUrl, String branch = 'main') {
    new Checkout().call(gitUrl, branch)
}

 def gitleaks() {
     new Gitleaks().call()
 }

def trivyinstaller(String repoUrl) {
     new Trivyinstaller().call(repoUrl)
 }

def notification() {
    new Notification().call()
}

