


import java.util.LinkedList;

import java.util.Queue;


import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viren
 */

public class roundRobin extends javax.swing.JFrame {

    /**
     * Creates new form roundRobin
     */
    public roundRobin(int a) {
        initComponents();
             int size = a;
       loadtable(size);
    }

    private roundRobin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  public void loadtable(int size)
{
     DefaultTableModel model=(DefaultTableModel)table.getModel();//to perform operation o table like add row, delete row, data retrive
           table.setModel(model);
           model.setRowCount(0);//to set row blank intially
           Object row[]=new Object[size];
           while(size!=0)
           {
                model.addRow(row);
                size--;
           }
             for(int i=0; i<model.getRowCount(); i++)
                for(int j=0; j<model.getColumnCount(); j++)
                        {  model.setValueAt(0, i,j);
                         
                        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnget = new javax.swing.JButton();
        txttimeq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        avgwt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        avgtat = new javax.swing.JTextField();
        btnexit = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("ROUND ROBIN");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Process", "Arrival Time", "Burst Time", "ct", "tat", "Witing Time"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btnget.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btnget.setText("Get Waiting Time");
        btnget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Time Quantum");

        avgwt.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel3.setText("Avg. Waiting Time");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setText("Avg. TurnAround Time");

        avgtat.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N

        btnexit.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Cambria", 1, 11)); // NOI18N
        btnback.setText("BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnget, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avgwt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avgtat, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(txttimeq, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttimeq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avgwt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(avgtat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnget)
                        .addGap(18, 18, 18)
                        .addComponent(btnexit)
                        .addGap(18, 18, 18)
                        .addComponent(btnback)))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked
  


 
    private void btngetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetActionPerformed
        // TODO add your handling code here:

  
        DefaultTableModel model =(DefaultTableModel) table.getModel();
       int f[]=new int [model.getRowCount()];
        int at[]=new int [model.getRowCount()];
        int bt[]=new int [model.getRowCount()];
        int ct[]=new int [model.getRowCount()];
        int wt[]=new int [model.getRowCount()];
        int tat[]=new int [model.getRowCount()];
        int p[]=new int [model.getRowCount()];
     
        int rem_bt[] = new int[model.getRowCount()];  
        int n=model.getRowCount();
        int tc =Integer.parseInt(txttimeq.getText());
        for(int i=0; i<model.getRowCount(); i++)
        {
            p[i]=Integer.parseInt(model.getValueAt(i,0).toString());
            at[i]=Integer.parseInt(model.getValueAt(i,1).toString());
            bt[i]=Integer.parseInt(model.getValueAt(i,2).toString());
            f[i]=0;
      
        }
  //sorting of arrays
  sort_arrays(at,bt,p,rem_bt,n);
      
        int t = 0,r=-1,u=0;
  for(int i=0; i<n; i++)
  {
      if(at[i]!=0)
      {
        u++;   
      }
    
  }
  if(u==0)
    arrival_0(ct,t,rem_bt,tc,n);

 else
    arrival_not0(ct,t,rem_bt,tc,n, at,f,r);   
 
             double total_wt=0,  total_tat=0;
	    for(int i=0;i<n;i++)
	    {
	    	tat[i] = ct[i] - at[i];
	    	wt[i] = tat[i] - bt[i];
	         total_wt+=wt[i];
                 total_tat+=tat[i];
	    }
	 avgwt.setText((double)Math.round(total_wt)/n+"");  
          avgtat.setText((double)Math.round(total_tat)/n+""); 
 
          for(int i=0; i<model.getRowCount(); i++)
            {  model.setValueAt(p[i], i,0);
                model.setValueAt(at[i], i,1);
               model.setValueAt(bt[i], i,2);
               model.setValueAt(ct[i], i,3);
               model.setValueAt(tat[i], i,4);
               model.setValueAt(wt[i], i,5);
            }

        
                   
    }//GEN-LAST:event_btngetActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
             System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
         welcome w = new welcome();
        w.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnbackActionPerformed
public void sort_arrays(int at[],int bt[],int p[],int rem_bt[],int n)
{
        for (int i = 0; i < at.length - 1; i++)  
           {  
            int index = i;  
            for (int j = i + 1; j < at.length; j++)
            {  
                if (at[j] < at[index])
                {  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = at[index];  
            int smallerNumber1 =bt[index];
            int smallerNumber2 =p[index];
            at[index] = at[i]; 
            bt[index] = bt[i];
             p[index] = p[i];
             at[i]= smallerNumber; 
             bt[i]= smallerNumber1;
             p[i]= smallerNumber2;
         }     
    
        System.arraycopy(bt, 0, rem_bt, 0, n);


  
}
    public void arrival_not0(int ct[],int t, int rem_bt[],int tc,int n,int at[],int f[],int r)
 {   Queue<Integer> q = new LinkedList<>();
      while(true)
        {          
                  //boolean done = true;
              int count =0;
            for(int i=0; i<n; i++)
               {
                  if((at[i]<=t)&&(rem_bt[i]>0)&&(f[i]==0))
                  { int b=at[i];
                     q.add(b);
                     f[i]=1;
                  }
                
                
               }
            
              if((r!=-1))
              
                  {
                      q.add(r);
                     
                  }
           if(q.isEmpty())
              {
                  t++;
               continue;
              }

             else
              {  int c=q.remove();

                 for ( int i=0;i<n;i++)
                 if( at[i]==c)
                 {   
               
                         if (rem_bt[i] > 0)
                        {
                           //s  done = false;

                             if (rem_bt[i] > tc)
                             {  t += tc;

                             rem_bt[i] -= tc;
                             ct[i]=t;
                           //  q.add(at[i]);
                           if(rem_bt[i]!=0)
                             r= at[i];
                            
                         

                             }
                             else 
                             {   t+= rem_bt[i];

                             rem_bt[i] = 0;
                             ct[i]=t;
                               
                             }

                         }
                 } 
              }   
                  //break statement calculation
                  for(int i=0; i<n; i++)
                   if (rem_bt[i]!=0)
                       count++;
                  if(count==0)
                           break; 
        }

              
 }

    public void arrival_0(int ct[],int t, int rem_bt[],int tc,int n)
  {
           while(true)
        {
            boolean done = true;
      
            for (int i = 0 ; i < n; i++)
            {
                if (rem_bt[i] > 0)
                {
                    done = false; 
      
                    if (rem_bt[i] > tc)
                    {
                        t += tc;
                        ct[i]=t;
                  
                        rem_bt[i] -= tc;
                    }
      
                    else
                    {
                        t = t + rem_bt[i];
      
                       ct[i]=t;
      
                        rem_bt[i] = 0;
                    }
                }
            }
      
            if (done == true)
              break;
        }
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(roundRobin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roundRobin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roundRobin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roundRobin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roundRobin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avgtat;
    private javax.swing.JTextField avgwt;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnget;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txttimeq;
    // End of variables declaration//GEN-END:variables
}
