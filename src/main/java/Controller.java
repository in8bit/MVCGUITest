import javax.swing.JOptionPane;
public class Controller {
    private Model model;
    private View view;
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        initView();
    }
    public void initView() {
        view.getInputUrlTextArea().setText(model.getUrl());
        view.getFileNameTextField().setText(model.getFileName());
        view.getDepthTextField().setText(String.valueOf(model.getDepth()));
        view.getProgressArea().setText(model.getProgress());
    }
    public void initController() {
        view.getCrawlButton().addActionListener(e -> saveUrl());
        view.getGenerateCSVButton().addActionListener(e -> generateCSV());
        view.getStop().addActionListener(e -> stopProgram());
    }
    private void saveUrl() {
        model.setUrl(view.getInputUrlTextArea().getText());
        System.out.println(model.getUrl());
    }
    private void generateCSV() {
        System.out.println("generate CSV");
    }
    private void stopProgram() {
        System.out.println("stop progam");
    }

}
