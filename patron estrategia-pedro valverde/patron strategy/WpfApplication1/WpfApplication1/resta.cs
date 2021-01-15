using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WpfApplication1
{
    class resta : IOperacion
    {
            public int Calcular(int value1, int value2)
            {
                //define logic  
                return value1 - value2;
            }
    }
}
