import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button1 = new JButton("	+	");
    JButton button2 = new JButton("	- ");
    JButton button3 = new JButton("	X	");
    JButton button4 = new JButton("	/	");
    JButton button5 = new JButton("	x^2 ");
    JButton button6 = new JButton("	Square Root	");
    Font font = new Font("Times new roman", Font.BOLD, 100);

    Calculator() {
        super("Калькулятор");
        setLayout(new	FlowLayout());
        setSize(350,150);
        add(new	JLabel("Число	А"));
        add	(jta1);
        add(new JLabel("Число В"));
        add	(jta2);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);

        button1.addActionListener(new ActionListener() { public	void	actionPerformed(ActionEvent e)	{
            try{
                double	x1 = Double.parseDouble(jta1.getText().trim());
                double	x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(null,	"Результат	=		" +(x1+x2),	"Внимание!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            catch	(Exception	e1){
                JOptionPane.showMessageDialog(null,	"Ошибка в числе!\nПопробуйте еще раз!", "Внимание!",	JOptionPane.ERROR_MESSAGE);
            }
        }
        });

        button2.addActionListener(new ActionListener() { public	void	actionPerformed(ActionEvent e)	{
            try{
                double	x1 = Double.parseDouble(jta1.getText().trim());
                double	x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(null,	"Результат	=		" +(x1-x2),	"Внимание!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            catch	(Exception	e1){
                JOptionPane.showMessageDialog(null,	"Ошибка в числе!\nПопробуйте еще раз!", "Внимание!",	JOptionPane.ERROR_MESSAGE);
            }
        }
        });

        button3.addActionListener(new ActionListener() { public	void	actionPerformed(ActionEvent e)	{
            try{
                double	x1 = Double.parseDouble(jta1.getText().trim());
                double	x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(null,	"Результат	=		" +(x1*x2),	"Внимание!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            catch	(Exception	e1){
                JOptionPane.showMessageDialog(null,	"Ошибка в числе!\nПопробуйте еще раз!", "Внимание!",	JOptionPane.ERROR_MESSAGE);
            }
        }
        });

        button4.addActionListener(new ActionListener() { public	void	actionPerformed(ActionEvent e)	{
            try{
                double	x1 = Double.parseDouble(jta1.getText().trim());
                double	x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(null,	"Результат	=		" +(x1/x2),	"Внимание!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            catch	(Exception	e1){
                JOptionPane.showMessageDialog(null,	"Ошибка в числе!\nПопробуйте еще раз!", "Внимание!",	JOptionPane.ERROR_MESSAGE);
            }
        }
        });

        button5.addActionListener(new ActionListener() { public	void	actionPerformed(ActionEvent e)	{
            try{
                double	x1 = Double.parseDouble(jta1.getText().trim());
                JOptionPane.showMessageDialog(null,	"Результат	=		" +(x1*x1),	"Внимание!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            catch	(Exception	e1){
                JOptionPane.showMessageDialog(null,	"Ошибка в числе!\nПопробуйте еще раз!", "Внимание!",	JOptionPane.ERROR_MESSAGE);
            }
        }
        });

        button6.addActionListener(new ActionListener() { public	void	actionPerformed(ActionEvent e)	{
            try{
                double	x1 = Double.parseDouble(jta1.getText().trim());
                JOptionPane.showMessageDialog(null,	"Результат	=		" +(Math.sqrt(x1)),	"Внимание!",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            catch	(Exception	e1){
                JOptionPane.showMessageDialog(null,	"Ошибка в числе!\nПопробуйте еще раз!", "Внимание!",	JOptionPane.ERROR_MESSAGE);
            }
        }
        });
        setVisible(true);
    }
    public	static	void	main(String[]	args)	{
        new	Calculator();
    }
}