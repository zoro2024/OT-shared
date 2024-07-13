// import org.python.CoveragePython
// import org.python.Dependency
// import org.python.SonarQube
import org.generic.Checkout
//import org.generic.Gitleaks
//import org.generic.Trivyinstaller


def checkoutgit(String gitUrl, String branch = 'main') {
    new Checkout().call(gitUrl, branch)
}

 def gitleaks() {
     new Gitleaks().call()
 }

def trivyinstaller(String repoUrl) {
     new Trivyinstaller().call(repoUrl)
 }

// def callSonarqube() {
//     new UnitTesting().call()
// }

// def callUnitTesting() {
//     new UnitTesting().call()
// }
