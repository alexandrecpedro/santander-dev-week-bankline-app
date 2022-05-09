import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const baseUrl = 'http://localhost:8080';

@Injectable({
  providedIn: 'root'
})
export class AccountholderService {
  // Constructor
  constructor(private http: HttpClient) { }

  // Methods
  list(): Observable<any> {
    return this.http.get(`${baseUrl}/accountholders`);
  }

  create(accountHolder: any): Observable<any> {
    return this.http.post(`${baseUrl}/accountholders`, accountHolder);
  }
}
