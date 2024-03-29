// import { Injectable } from '@angular/core';
// import {AuthService} from "../services/auth.service";
// import {HttpEvent, HttpHandler, HttpInterceptor, HttpRequest} from "@angular/common/http";
// import {catchError, Observable, throwError} from "rxjs";
//
// @Injectable({
//   providedIn: 'root'
// })
// export class TokenInterceptorService implements HttpInterceptor {
//
//   constructor(private _authService:AuthService) { }
//   intercept(
//     request: HttpRequest<any>,
//     next: HttpHandler
//   ): Observable<HttpEvent<any>> {
//     const token = localStorage.getItem('token');
//     if (token) {
//       request = request.clone({
//         setHeaders: {
//           Authorization: `Bearer ${token}`,
//         },
//       });
//     }
//     return next.handle(request).pipe(
//       catchError((err) => {
//         if (err.status === 401) {
//           this._authService.logout();
//         }
//         const error = err.error.message || err.statusText;
//         return throwError(error);
//       })
//     );
//   }
// }
