import React from 'react';
import { FormattedMessage } from 'react-intl';

// Import Style
import styles from './Footer.css';

// Import Images
import bg from '../../header-bk.png';

export function Footer() {
  return (
    <div style={{ background: `#FFF url(${bg}) center` }} className={styles.footer}>     
      <p><FormattedMessage id="twitterMessage" /> : <a href="https://twitter.com/" target="_Blank"></a></p>
    </div>
  );
}

export default Footer;
