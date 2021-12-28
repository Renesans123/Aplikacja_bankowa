import javax.swing.*;
import java.awt.*;

public class HelpClientPanel extends JPanel {

    AppFrame parent;
    Client client;
    private Dictionary dict;

    public HelpClientPanel(AppFrame mparent, Client mclient) {
        super();
        parent = mparent;
        client = mclient;
        dict = new Dictionary("Pol");
        initialize();
    }

    private void initialize() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        c.weightx = 0.5;
        c.weighty = 0.5;

        PageButtonsPanel pageButPan = new PageButtonsPanel(parent, client);
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = GridBagConstraints.REMAINDER;
        this.add(pageButPan, c);

        JLabel helpLabel = new JLabel(dict.getText("my_help"));
        c.gridx = 0;
        c.gridy = 1;
        this.add(helpLabel, c);
    }
}
