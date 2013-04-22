/* Generated by Xgen from: E60_baseline on: 2002-02-12 17:59 */
/*******************************************************************************
* 2002 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqNcmLis.hxx
*
*  DESCRIPTION: see documentation
*
*******************************************************************************/

#ifndef _INQNCMLIS_HXX_
#define _INQNCMLIS_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

#define BSC_INQ_NCM_LIS_REC_MAX	310

/******************************************************************************/

#ifndef _BSC_INQ_NCM_LIS_REQUEST_T_
#define _BSC_INQ_NCM_LIS_REQUEST_T_

typedef struct bscInqNcmLisRequestTag
{
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
} bscInqNcmLisRequestT, *pBscInqNcmLisRequestT;


#endif  /* _BSC_INQ_NCM_LIS_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_NCM_LIS_REQUEST_T_
#define _INQ_NCM_LIS_REQUEST_T_

typedef struct inqNcmLisRequestTag
{
  dataHeaderT header;
  bscInqNcmLisRequestT basic;
} inqNcmLisRequestT, *pInqNcmLisRequestT;


#endif  /* _INQ_NCM_LIS_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_NCM_LIS_REC_T_
#define _BSC_INQ_NCM_LIS_REC_T_

typedef struct bscInqNcmLisRecTag
{
  char membExchIdCod[MEMB_EXCH_ID_COD_LEN];
  char relaSts;
} bscInqNcmLisRecT, *pBscInqNcmLisRecT;


#endif  /* _BSC_INQ_NCM_LIS_REC_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_NCM_LIS_RESPONSE_T_
#define _BSC_INQ_NCM_LIS_RESPONSE_T_

typedef struct bscInqNcmLisResponseTag
{
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
  char mliRecCtr[DRIV_MLI_REC_CTR_LEN];
  bscInqNcmLisRecT bscInqNcmLisRec[BSC_INQ_NCM_LIS_REC_MAX];
} bscInqNcmLisResponseT, *pBscInqNcmLisResponseT;


#endif  /* _BSC_INQ_NCM_LIS_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_NCM_LIS_RESPONSE_T_
#define _INQ_NCM_LIS_RESPONSE_T_

typedef struct inqNcmLisResponseTag
{
  dataHeaderT header;
  bscInqNcmLisResponseT basic;
} inqNcmLisResponseT, *pInqNcmLisResponseT;


#endif  /* _INQ_NCM_LIS_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQNCMLIS_HXX_ */

/******************************************************************************/
/* End of file InqNcmLis.hxx */
/******************************************************************************/