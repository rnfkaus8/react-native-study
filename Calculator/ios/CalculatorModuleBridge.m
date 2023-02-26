//
//  CalculatorModuleBridge.m
//  Calculator
//
//  Created by 김태현 on 2023/02/26.
//

#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(CalculatorModule, NSObject)

RCT_EXTERN_METHOD(executeCalc: (NSString *) actions
                  numberA: (int) numberA
                  numberB: (int) numberB
                  resolver: (RCTPromiseResolveBlock) resolve
                  rejector: (RCTPromiseRejectBlock) reject
                  )

@end
