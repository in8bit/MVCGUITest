import java.awt.BorderLayout;
import javax.swing.*;

public class View {
    // View uses Swing framework to display UI to user
    private JFrame frame;
    private JLabel inputUrlLable;
    private JLabel progressLable;
    private JLabel depthLable;
    private JLabel fileNameLable;
    private JTextArea inputUrlTextArea;
    private JTextField fileNameTextField;
    private JTextField depthTextField;
    private JTextArea progressArea;
    private JButton crawlButton;
    private JButton generateCSVButton;
    private JButton stop;


    public View(String title) {
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        // Create UI elements
        inputUrlLable = new JLabel("Enter URLs :");
        fileNameLable = new JLabel("Enter File name :");
        progressLable = new JLabel("Progress :");
        depthLable = new JLabel("Depth :");
        inputUrlTextArea = new JTextArea();
        fileNameTextField = new JTextField();
        depthTextField = new JTextField();
        progressArea = new JTextArea();
        crawlButton = new JButton("Crawl");
        generateCSVButton = new JButton("Generate CSV");
        stop = new JButton("Stop");

        // Add UI element to frame
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(inputUrlLable)
                        .addComponent(fileNameLable).addComponent(depthLable).addComponent(progressLable))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(inputUrlTextArea)
                        .addComponent(fileNameTextField).addComponent(depthTextField).addComponent(progressArea))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(crawlButton)
                        .addComponent(generateCSVButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(stop)));
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(inputUrlLable)
                        .addComponent(inputUrlTextArea).addComponent(crawlButton).addComponent(stop))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(fileNameLable)
                        .addComponent(fileNameTextField).addComponent(generateCSVButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(depthLable).addComponent(depthTextField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(progressLable).addComponent(progressArea))
                );

        layout.linkSize(SwingConstants.HORIZONTAL, crawlButton, generateCSVButton);
        layout.linkSize(SwingConstants.HORIZONTAL, stop);
        frame.getContentPane().setLayout(layout);
    }
    public JFrame getFrame() {
        return frame;
    }
    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    public JLabel getInputUrlLable() {
        return inputUrlLable;
    }
    public void setInputUrlLable(JLabel inputUrlLable) {
        this.inputUrlLable = inputUrlLable;
    }

    public JLabel getProgressLable() {
        return progressLable;
    }

    public void setProgressLable(JLabel progressLable) {
        this.progressLable = progressLable;
    }

    public JLabel getDepthLable() {
        return depthLable;
    }

    public void setDepthLable(JLabel depthLable) {
        this.depthLable = depthLable;
    }

    public JTextField getDepthTextField() {
        return depthTextField;
    }

    public void setDepthTextField(JTextField depthTextField) {
        this.depthTextField = depthTextField;
    }

    public JTextArea getProgressArea() {
        return progressArea;
    }

    public void setProgressArea(JTextArea progressArea) {
        this.progressArea = progressArea;
    }

    public JLabel getFileNameLable() {
        return fileNameLable;
    }
    public void setFileNameLable(JLabel lastnameLabel) {
        this.fileNameLable = lastnameLabel;
    }
    public JTextArea getInputUrlTextArea() {
        return inputUrlTextArea;
    }
    public void setInputUrlTextArea(JTextArea inputUrlTextArea) {
        this.inputUrlTextArea = inputUrlTextArea;
    }
    public JTextField getFileNameTextField() {
        return fileNameTextField;
    }
    public void setFileNameTextField(JTextField fileNameTextField) {
        this.fileNameTextField = fileNameTextField;
    }
    public JButton getCrawlButton() {
        return crawlButton;
    }
    public void setCrawlButton(JButton crawlButton) {
        this.crawlButton = crawlButton;
    }
    public JButton getGenerateCSVButton() {
        return generateCSVButton;
    }
    public void setGenerateCSVButton(JButton generateCSVButton) {
        this.generateCSVButton = generateCSVButton;
    }
    public JButton getStop() {
        return stop;
    }
    public void setStop(JButton stop) {
        this.stop = stop;
    }

}