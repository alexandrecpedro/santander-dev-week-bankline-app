import { Component, OnInit } from '@angular/core';
import { AccountholderService } from 'src/app/services/accountholder.service';
import { TransactionService } from 'src/app/services/transaction.service';

@Component({
  selector: 'app-transaction-new',
  templateUrl: './transaction-new.component.html',
  styleUrls: ['./transaction-new.component.css']
})
export class TransactionNewComponent implements OnInit {
  // Attribute
  dateTime: any;
  description: any;
  value: any;
  type: any;

  accountholders: any;
  accountholder: any;

  // Constructor
  constructor(
    private transactionService: TransactionService,
    private accountHolderService: AccountholderService
  ) { }

  // Methods
  ngOnInit(): void {
    this.showAccountHolders();
  }

  showAccountHolders(): void {
    this.accountHolderService.list()
      .subscribe(
        data => {
          this.accountholders = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

  save(): void {
    console.log(this.accountholders)
    const transaction = {
      value: this.value,
      description: this.description,
      type: this.type,
      idAccount: this.accountholders.id,
      dateTime: this.dateTime
    };
    console.log(transaction);
    this.transactionService.create(transaction)
      .subscribe(
        response => {
          console.log(response);
        },
        error => {
          console.log(error);
        });
  }

}
