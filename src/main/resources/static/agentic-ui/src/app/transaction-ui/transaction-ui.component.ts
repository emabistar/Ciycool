import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import {HttpClient} from '@angular/common/http';
@Component({
  selector: 'app-transaction-ui',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './transaction-ui.component.html',
  styleUrls: ['./transaction-ui.component.css']
})
export class TransactionUiComponent {



  transactions: any;
  constructor(private http:HttpClient) {
    this.http.get("http://localhost:8091/transactions")
      .subscribe(
        {
          next:data => {
            this.transactions = data
          },
        error : err => {
      console.log(err);


    }})

  }

}



