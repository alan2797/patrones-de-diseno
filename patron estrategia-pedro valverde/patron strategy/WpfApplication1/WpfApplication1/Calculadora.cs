using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WpfApplication1
{
    class Calculadora
    {
        private IOperacion operacionresultado;

        //Constructor: assigns strategy to interface  
        public Calculadora()
        {
            
        }

        //Executes the strategy  
        public int CalcularResultado(IOperacion operacion,int value1, int value2)
        {
            operacionresultado = operacion;
            return operacionresultado.Calcular(value1, value2);
        }
    }
}
