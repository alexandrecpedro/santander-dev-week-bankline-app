import { Component, OnInit } from '@angular/core';
import { AccountholderService } from 'src/app/services/accountholder.service';

@Component({
  selector: 'app-account-holder',
  templateUrl: './account-holder.component.html',
  styleUrls: ['./account-holder.component.css']
})
export class AccountHolderComponent implements OnInit {
  // Attributes
  accountholders: any;
  cpf: any;
  name: any;

  // Constructor
  constructor(
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
    const accountHolder = {
      cpf: this.cpf,
      name: this.name
    };
    console.log(accountHolder);
    this.accountHolderService.create(accountHolder)
      .subscribe(
        response => {
          console.log(response);
          this.showAccountHolders();
        },
        error => {
          console.log(error);
        });
  }
}
