import org.generic.Checkoutscm

def checkoutscm(String url, String creds, String branch = 'main') {
    new Checkoutscm().call(url, branch, creds)
}
