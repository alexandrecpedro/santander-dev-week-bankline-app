import { Component, OnInit } from '@angular/core';
import { TransactionService } from 'src/app/services/transaction.service';

@Component({
  selector: 'app-transaction-list',
  templateUrl: './transaction-list.component.html',
  styleUrls: ['./transaction-list.component.css']
})
export class TransactionListComponent implements OnInit {
  // Attributes
  transactions: any;

  // Constructor
  constructor(private transactionService: TransactionService) { }

  // Methods
  ngOnInit(): void {
    this.transactionsList();
  }

  transactionsList(): void {
    this.transactionService.list()
      .subscribe(
        data => {
          this.transactions = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

}
