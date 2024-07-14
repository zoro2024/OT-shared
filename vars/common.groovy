import org.generic.Checkoutscm

def checkoutscm(String url, String branch = 'main', String creds) {
    new Checkoutscm().call(url, branch, creds)
}
