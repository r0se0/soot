/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 1997 - 2018 Raja Vallée-Rai and others
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */
public class InnerTest1 {
    
    int c = 0;
    public static void main(String [] args){
        InnerTest1 it1 = new InnerTest1();
        it1.run();
    }

    public void run(){
        if (c--<0) return;
        //int x = new InnerClass().run();
        //System.out.println("x: "+x);
    }

    int i = 10;
    public class InnerClass{
        public int run(){
            System.out.println("Smile");
            if (i--<0) return 0;
            
            return new InnerClass().run();
        }
    }
}
