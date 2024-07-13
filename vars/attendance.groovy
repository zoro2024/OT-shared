// import org.python.CoveragePython
// import org.python.Dependency
// import org.python.SonarQube
// import org.python.UnitTesting
import org.python.HelloWorld
import org.python.Checkout

def checkoutgit(String gitUrl, String branch = 'main') {
    new Checkout().call(gitUrl, branch)
}

 def helloworld() {
     new HelloWorld().call()
 }

// def callDependency() {
//     new Dependency().call()
// }

// def callSonarqube() {
//     new UnitTesting().call()
// }

// def callUnitTesting() {
//     new UnitTesting().call()
// }
