import org.generic.Checkout
import org.generic.Gitleaks
import org.generic.Trivyinstaller
import org.generic.Notification

def checkout(String url, String creds, String branch = 'main') {
    new Checkout().call(url, branch, creds)
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

