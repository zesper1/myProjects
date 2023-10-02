package alpha;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.*;
public class passfield extends JPasswordField {
    private Icon prefixIcon;
    private Icon suffixIcon;
    public passfield(){
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }
    
    @Override
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        paintIcon(g);
    }
    private void paintIcon(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g; 
        if(prefixIcon!=null)
        {
            Image prefix = ((ImageIcon)prefixIcon).getImage();
            int y = (getHeight()-prefixIcon.getIconHeight()) / 2;
            g2.drawImage(prefix, 0, y, this);
        }
        if(suffixIcon!=null)
        {
            Image suffix = ((ImageIcon)suffixIcon).getImage();
            int y = (getHeight()-suffixIcon.getIconHeight()) / 2;
            g2.drawImage(suffix, getWidth()-suffixIcon.getIconWidth(), y, this);
        }
    }

    /**
     * @return the prefixIcon
     */
    public Icon getPrefixIcon() {
        return prefixIcon;
    }

    /**
     * @param prefixIcon the prefixIcon to set
     */
    public void setPrefixIcon(Icon prefixIcon) {
        this.prefixIcon = prefixIcon;
        initBorder();
    }

    /**
     * @return the suffixIcon
     */
    public Icon getSuffixIcon() {
        return suffixIcon;
    }

    /**
     * @param suffixIcon the suffixIcon to set
     */
    public void setSuffixIcon(Icon suffixIcon) {
        this.suffixIcon = suffixIcon;
        initBorder();
    }
    private void initBorder(){
        int left = 5;
        int right = 5;
        if(prefixIcon != null){
            left = prefixIcon.getIconWidth();
        }
        if(suffixIcon != null){
            right = suffixIcon.getIconWidth();
        }
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, left, 5, right));
    }
}

