using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace WpfApplication1
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        Calculadora calculadora;
        public MainWindow()
        {
            ;
            InitializeComponent();
            calculadora = new WpfApplication1.Calculadora();
        }

        private void Image_MouseDown(object sender, MouseButtonEventArgs e)
        {
            tbResultado.Text=calculadora.CalcularResultado(new suma(), int.Parse(tbValor1.Text), int.Parse(tbValor2.Text)).ToString();
        }

        private void Image_MouseDown_1(object sender, MouseButtonEventArgs e)
        {
            tbResultado.Text = calculadora.CalcularResultado(new resta(), int.Parse(tbValor1.Text), int.Parse(tbValor2.Text)).ToString();
        }

        private void Image_MouseDown_2(object sender, MouseButtonEventArgs e)
        {
            tbResultado.Text = calculadora.CalcularResultado(new multiplicar(), int.Parse(tbValor1.Text), int.Parse(tbValor2.Text)).ToString();
        }
    }
}
