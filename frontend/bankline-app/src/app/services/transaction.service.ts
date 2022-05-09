import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const baseUrl = 'http://localhost:8080';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {
  // Constructor
  constructor(private http: HttpClient) { }

  // Methods
  list(): Observable<any> {
    return this.http.get(`${baseUrl}/transactions`);
  }

  findByIdConta(idAccount: any): Observable<any> {
    return this.http.get(`${baseUrl}/transactions/${idAccount}`);
  }

  create(transaction: any): Observable<any> {
    return this.http.post(`${baseUrl}/transactions`, transaction);
  }

}
