/* Generated by Xgen from: E61.02.00 on: 2003-03-12 16:09 */
/*******************************************************************************
* 2003 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   DelVolTrd.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _DELVOLTRD_HXX_
#define _DELVOLTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>


/******************************************************************************/

#ifndef _FUT_BSC_DEL_VOL_TRD_REQUEST_T_
#define _FUT_BSC_DEL_VOL_TRD_REQUEST_T_

typedef struct futBscDelVolTrdRequestTag
{
  char trnIdNo[TRN_ID_NO_LEN];
  char prodId[PROD_ID_LEN];
  trdrIdGrpT trdrIdGrp;
  char dateLstUpdDat[DRIV_TIMESTAMP_LEN];
} futBscDelVolTrdRequestT, *pFutBscDelVolTrdRequestT;


#endif  /* _FUT_BSC_DEL_VOL_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_DEL_VOL_TRD_REQUEST_T_
#define _FUT_DEL_VOL_TRD_REQUEST_T_

typedef struct futDelVolTrdRequestTag
{
  dataHeaderT header;
  futBscDelVolTrdRequestT basic;
} futDelVolTrdRequestT, *pFutDelVolTrdRequestT;


#endif  /* _FUT_DEL_VOL_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_DEL_VOL_TRD_RESPONSE_T_
#define _FUT_DEL_VOL_TRD_RESPONSE_T_

typedef struct futDelVolTrdResponseTag
{
  dataHeaderT header;
} futDelVolTrdResponseT, *pFutDelVolTrdResponseT;


#endif  /* _FUT_DEL_VOL_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _DELVOLTRD_HXX_ */

/******************************************************************************/
/* End of file DelVolTrd.hxx */
/******************************************************************************/
