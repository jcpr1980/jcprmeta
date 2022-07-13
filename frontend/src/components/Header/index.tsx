import logo from '../../assets/img/logo.svg'
import './styles.css'

function Header() {
    return(
        <header>
            <div className="jcprmeta-logo-container">
                <img src={logo} alt="JCPRMeta" />
                <h1>JCPRMeta</h1>
                <p>Desenvolviudo por 
                    <a href="https://www.instagram.com/jcpribeiro/">@jcpribeiro</a>
                </p>
            </div>
    </header>
    )
}

export default Header
