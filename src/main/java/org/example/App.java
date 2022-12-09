package org.example;

import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import org.example.Program;

public class App
{
    public static void main( String[] args )
    {
        BaseCustomerManager customerManagerStarbucks = new StarbucksCustomerManager(new CustomerCheckManager());
        customerManagerStarbucks.Save(new Customer(5890, "Ahmet", "Kaya", 1950, 129756439));





    }
}
